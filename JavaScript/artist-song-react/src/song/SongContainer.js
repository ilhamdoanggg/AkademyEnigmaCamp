import React, {Component} from 'react';
import SongList from "./SongList";
import {Provider} from "react-redux";
import {createStore} from "redux";
import songReducer from "./reducer/SongReducer";

class SongContainer extends Component {
    render() {
        return (
            <Provider store={createStore(songReducer)}>
               <SongList/>
            </Provider>
        );
    }
}

export default SongContainer;
