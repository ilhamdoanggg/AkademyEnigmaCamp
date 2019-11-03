import React, {Component} from "react";
import {Provider} from "react-redux";
import {createStore} from "redux";
import artistReducer from "./reducer/ArtistReducer";
import ArtistForm from "./ArtistForm";
import ArtistList from "./ArtistList";

class ArtistContainer extends Component{

    render() {
        return (
            <Provider store={createStore(artistReducer)}>
            <div>
                <ArtistForm/>
                <ArtistList/>
            </div>
            </Provider>
        );
    }
}

export default ArtistContainer;
