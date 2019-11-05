import React, {Component} from 'react';
import {connect} from "react-redux";

class SongInputForm extends Component {

    handleInputName = (event) => {
        this.props.dispatch({type: 'INPUT_SONG_NAME', index:this.props.index, songName:event.target.value})
    }
    handleInputRelease = (event) => {
        console.log(event.target.value, "asasas", this.props.artistsForm)
        this.props.dispatch({type: 'INPUT_SONG_REALESE', index:this.props.index, release:event.target.value})
    }
    render() {
     console.log(this.props)
        return (
            <div>
                <form>
                    <input type="text" placeholder="Song Name" onChange={this.handleInputName}/>
                    <input id="release" type="date" onChange={this.handleInputRelease}/>
                </form>
            </div>
        );
    }
}

const mapStateToProps = (state) => {
    return {...state}
}
export default connect(mapStateToProps)(SongInputForm);
