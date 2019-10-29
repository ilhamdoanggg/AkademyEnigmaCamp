import React, {Component} from 'react';
import {saveData} from "./SongServices";

class SongForm extends Component{
    constructor(props) {
        super(props);
        this.state = {
            songForm: {
                songName: "",
                idArtist: "",
                release: ""
            }
        }
    }
    handleInputName = (event) => {
        let song = {...this.state.songForm}
        song.name = event.target.value
        this.setState({songForm: {...song}})
    }
    handleInputBornPlace = (event) => {
        let song = {...this.state.songForm}
        song.birdPlace = event.target.value
        this.setState({songForm: {...song}})
    }
    handleInputDebut = (event) => {
        let song = {...this.state.songForm}
        song.debut = event.target.value
        this.setState({songForm: {...song}})
    }
    handleSubmit = (event) => {
        event.preventDefault();
        saveData(this.state.songForm)
    }
    render() {

        return (
            <div>
                <form className="col s12">
                    <div className="row">
                        <div className="input-field col s6">
                            <input type="text" className="validate"
                                   placeholder="Song Name" value={this.state.songForm.songName}
                                   onChange={this.handleInputName} required={true}/>
                        </div>


                        <div className="input-field col s12">
                            <select className="browser-default">
                                <option value="" selected>Choose your Artist</option>
                                <option value="1"> </option>
                            </select>
                        </div>
                            {/*<input id="birthPlace" type="text"
                                   className="validate" placeholder="Birth Place"
                                   value={this.state.songForm.idArtistTrancient}
                                   onChange={this.handleInputBornPlace} required={true}/>*/}

                    </div>

                    <div className="row">
                        <div className="input-field col s12">
                            <input id="debut" type="date" className="validate"
                                   value={this.state.songForm.release}
                                   onChange={this.handleInputDebut}/>
                            <label htmlFor="debut">Date Relese</label>
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
export default SongForm;
