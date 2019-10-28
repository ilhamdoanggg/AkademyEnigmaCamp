import React, {Component} from 'react';
import {BrowserRouter as Router} from "react-router-dom";
// import logo from './logo.svg';
import './style/App.css';
import NavbarComponent from "./component/NavbarComponent";
import FooterComponent from "./component/FooterComponent";
import ArtistContainer from "./artist/ArtistContainer";

class App extends Component {

    render() {
        return (
            <Router>
                <div className="App">
                    <NavbarComponent/>
                    <main>
                            <section className="container">
                                <ArtistContainer></ArtistContainer>

                            </section>
                    </main>
                </div>
                <FooterComponent/>
            </Router>
        );
    }
}

export default App;
