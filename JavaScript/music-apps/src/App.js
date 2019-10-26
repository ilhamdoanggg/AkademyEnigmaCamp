import React, {Component} from 'react';
import logo from './logo.svg';
import './style/App.css';
import ArtistContainer from "./artist/ArtistContainer";

class App extends Component{
    constructor(props) {
        super(props);
        this.state={
            name:"ilham",
            outputName:""
        }
    }
    handleChange=(event)=>{
        this.setState({name: event.target.value});
    }
    onClick=(event)=>{
        this.setState({outputName:this.state.name})
    }
    render() {
        const data = [{name:"ilham"},{name:"ganteng"}]
    return (
        <div className="App">
            <nav className="nav-wrapper">
                    <a href="#" className="brand-logo right">Logo</a>
                    <ul id="nav-mobile" className="left hide-on-med-and-down">
                        <li><a href="sass.html">Aku ya Aku</a></li>
                        <li><a href="badges.html">Ini Aku</a></li>
                        <li><a href="collapsible.html">Aku Ganteng</a></li>
                    </ul>
                {/*<header className="nav-wrapper">*/}
              {/*  <img src={logo} className="App-logo" alt="logo" />*/}
              {/*</header>*/}
            </nav>
            <input value={this.state.name} onChange={this.handleChange}/>
            <button onClick={this.onClick}>Click</button>
            <label>{this.state.outputName}</label>
            <ArtistContainer artists={data}/>
        </div>
    );
  }
}
export default App;
