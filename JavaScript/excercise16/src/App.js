import React from 'react';
import './App.css';
import Card from "./components/Card";
import Header from "./components/Header";
import FooterComponent from "./components/FooterComponent";

class App extends React.Component {
    constructor(props){
        super(props);
        this.state={
            people:[{name:"ilham", age:10},
                {name:"ilham", age:10},
                {name:"ilham", age:10},
                {name:"ilham", age:10},
                {name:"ilham", age:10},
                {name:"ilham", age:10},
                {name:"ilham", age:10}]
        }
    }
    componentDidMount() {
        console.log("ini di mount");
    }
    componentWillMount() {
        console.log("componentWillMount()")
    }

    render() {
        let item =[];
        console.log(item);
        //for(let )
        for (let i = 0; i <this.state.people.length ; i++) {
            item.push(<Card people={this.state.people[i]}/>)
        }
        return (
            <div className="App">
                <Header></Header>
                {item}
                <FooterComponent></FooterComponent>
             </div>
        );
    }
}

export default App;
