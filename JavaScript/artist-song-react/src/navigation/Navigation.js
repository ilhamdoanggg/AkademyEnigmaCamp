import React, {Component} from 'react';
import {Link} from "react-router-dom";

class Navigation extends Component {
    render() {
        return (
         <div>
         <Link to="/artist">Artist</Link>
         <Link to="/song">Song</Link>
         </div>
        );
    }
}

export default Navigation;
