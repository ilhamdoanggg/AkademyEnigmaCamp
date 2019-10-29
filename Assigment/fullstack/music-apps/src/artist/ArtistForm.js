import React, {Component} from 'react';
import {saveData} from "./ArtistServices";

class ArtistForm extends Component{
    constructor(props) {
        super(props);
        this.state = {
            artistForm: {
                artistName: "",
                bornPlace: "",
                debut: ""
            }
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
    handleSubmit = (event) => {
        event.preventDefault();
        saveData(this.state.artistForm)
    }
    render() {

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
                        <div className="file-path-wrapper">
                            <input className="file-path validate" type="text"/>
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
