import React, {Component} from 'react';
import logo from './logo.svg';
import './App.css';

class App extends Component{
    constructor(props) {
        super(props);
        this.state={
            name:""
        }
    }
    handleChange=(event)=>{
        this.setState({name: event.target.value});
    }


    render() {
    return (
        <div className="App">
          <header className="App-header">
            <img src={logo} className="App-logo" alt="logo" />
          </header>
            <input value={this.state.name} onChange={this.handleChange}/>
            <label></label>
        </div>
    );
  }
}
export default App;
