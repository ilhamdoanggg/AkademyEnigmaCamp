import React, {Component} from 'react';
import {BrowserRouter as Router, Switch, Route,Link} from "react-router-dom";
import ArtistContainer from "./artist/ArtistContainer";
import SongContainer from "./song/SongContainer";
import Navigation from "./navigation/Navigation";

class App extends Component {
  render() {
    return (
        <Router>
            <Navigation/>
            <Switch>
                <Route path="/artist"><ArtistContainer/></Route>
                <Route path="/song"><SongContainer/></Route>
            </Switch>
        </Router>
    );
  }
}

export default App;
