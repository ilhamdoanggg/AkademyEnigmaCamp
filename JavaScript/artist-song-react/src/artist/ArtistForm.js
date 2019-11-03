import React, {Component} from 'react';
import {connect} from "react-redux";
import {fetchInsertDataArtistWithSong} from "./ArtistServices";
import SongInputForm from "./SongInputForm";

class ArtistForm extends Component {

    handleInputName = (event) => {
        this.props.dispatch({type: 'INPUT_NAME', payload: event.target.value})
    }
    handleInputBornPlace = (event) => {
        this.props.dispatch({type: 'INPUT_BIRD_PLACE', payload: event.target.value})
    }
    handleInputDebut = (event) => {
        this.props.dispatch({type: 'INPUT_DEBUT', payload: event.target.value})
    }
    // handleImageFile=(event)=>{
    //     let bikinImages = event.target.files[0];
    //     this.setState({images:bikinImages})
    // }
    handleSubmit = (event) => {
        event.preventDefault();
        let data = {...this.props.artistsForm}
        fetchInsertDataArtistWithSong(data)
        // saveDataArtistWithImages( this.state.images, this.state.artistForm )
    }

    render() {
        //console.log("ini form")
        return (
            <div>
                <form>
                    <input type="text" placeholder="Artist Name" onChange={this.handleInputName}/>
                    <input id="birthPlace" type="text" className="validate" placeholder="Birth Place"
                           onChange={this.handleInputBornPlace}/>
                    <input id="debut" type="date" onChange={this.handleInputDebut}/>
                    <button color="danger" onClick={this.handleSubmit}
                            className="btn-large">ADD Artist
                    </button>
                </form>
                <button color="danger" className="btn-large"
                        onClick={() => this.props.dispatch({type: 'ADD_SONG_FORM'})}>ADD SONG
                </button>
                {this.props.artistsForm.song.map((element, index) =>
                {return <SongInputForm element={element} index={index}/>})}
            </div>
        );
    }

}

const mapStateToProps = (state) => {
    return {...state}
}

export default connect(mapStateToProps)(ArtistForm);
