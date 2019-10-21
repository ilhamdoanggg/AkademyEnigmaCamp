import React from 'react';
import logo from './logo.svg';
import './App.css';
import CardComponent from "./CardComponent";

class App extends React.Component {
    constructor(props){
        super(props);
        this.state={
            people:{name:"ilham", age:10}
        }
    }
    render() {
        return (
            <div className="App">
                <header className="App-header">
                    <img src={logo} className="App-logo" alt="logo"/>
                </header>
                <CardComponent kirim={this.state.people} />
                <CardComponent kirim={this.state.people} />
                <CardComponent kirim={this.state.people} />
             </div>
        );
    }
}

export default App;
