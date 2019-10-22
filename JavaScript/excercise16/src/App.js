import React from 'react';
import './App.css';
import Card from "./components/Card";
import Header from "./components/Header";
import FooterComponent from "./components/FooterComponent";

class App extends React.Component {
    constructor(props) {
        super(props);
        this.state = {
            people: {name: "ilham", age: 10}
//                {name: "as", age: 10}
        }
    }

    render() {
        return (
            <div className="App">
                <Header></Header>
                <Card people={this.state.people}></Card>
                <button onClick={this.ubah}>Pencet Aku</button>
                <FooterComponent></FooterComponent>
            </div>
        );
    }

    ubah = () => {
        this.state.people.name = "Malhi";
        this.setState(this.state);
    }
}

export default App;
