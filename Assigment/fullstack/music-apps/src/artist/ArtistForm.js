import React, {Component} from 'react';
import {saveData, saveDataArtistWithImages} from "./ArtistServices";

class ArtistForm extends Component{
    constructor(props) {
        super(props);
        this.state = {
            artistForm: {
                name: "",
                birdPlace: "",
                debut: ""
            },
            images:[]
        }
    }
    handleInputName = (event) => {
        let artist = {...this.state.artistForm}
        artist.name = event.target.value
        this.setState({artistForm: {...artist}})
    }
    handleInputBornPlace = (event) => {
        let artist = {...this.state.artistForm}
        artist.birdPlace = event.target.value
        this.setState({artistForm: {...artist}})
    }
    handleInputDebut = (event) => {
        let artist = {...this.state.artistForm}
        artist.debut = event.target.value
        this.setState({artistForm: {...artist}})
    }
    handleImageFile=(event)=>{
        let bikinImages = event.target.files[0];
        this.setState({images:bikinImages})
        }
    handleSubmit = (event) => {
        event.preventDefault();
        this.props.submit(this.state.images, this.state.artistForm)
        // saveDataArtistWithImages( this.state.images, this.state.artistForm )
    }
    render() {
        console.log(this.state.images)
        console.log(this.state.artistForm.name)
        console.log(this.state.artistForm.debut)
        console.log(this.state.artistForm.birdPlace)
        return (
            <div>
                <form className="col s12">
                    <div className="row">
                        <div className="input-field col s6">
                            <input type="text" className="validate"
                                   placeholder="Artist Name" value={this.state.artistForm.name}
                                   onChange={this.handleInputName} required={true}/>
                        </div>
                        <div className="input-field col s6">
                            <input id="birthPlace" type="text"
                                   className="validate" placeholder="Birth Place"
                                   value={this.state.artistForm.birdPlace}
                                   onChange={this.handleInputBornPlace} required={true}/>
                        </div>
                    </div>
                    <div className="row">
                        <div className="input-field col s12">
                            <input id="debut" type="date" className="validate"
                                   value={this.state.artistForm.debut}
                                   onChange={this.handleInputDebut}/>
                            <label htmlFor="debut">Date Debut</label>
                        </div>
                    </div>
                    <div className="row">
                    <div className="file-field input-field col s12">
                        <div className="btn">
                            <span>File</span>
                            <input type="file"/>
                        </div>
                        <div className="file-path">
                            <input onChange={this.handleImageFile} name="file"
                                   className="file-path validate" type="file"/>
                        </div>
                    </div>
                    </div>
                    <button color="danger" onClick={this.handleSubmit}
                            className="btn-large">ADD</button>
                </form>
            </div>
        );
    }
}
export default ArtistForm;
