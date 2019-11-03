import React, {Component} from "react";
import {Provider} from "react-redux";
import {createStore} from "redux";
import artistReducer from "./reducer/ArtistReducer";
import ArtistList from "./ArtistList";

class ArtistContainer extends Component{

    render() {
        return (
            <Provider store={createStore(artistReducer)}>
            <div>
                <ArtistList/>
            </div>
            </Provider>
        );
    }
}

export default ArtistContainer;
