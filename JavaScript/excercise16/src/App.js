import React from 'react';
import './style/App.css';
import CardComponent from "./components/CardComponent";
import Header from "./components/Header";
import StudentForm from "./student/StudentForm";
import FooterComponent from "./components/FooterComponent";

class App extends React.Component {
    constructor(props) {
        super(props);
        this.state = {
            peoples: []
        }
    }

    render() {
        let item = []
        for (let i = 0; i < this.state.peoples.length; i++) {
            item.push(<CardComponent item={this.state.peoples[i]}/>)
        }
        return (
            <div className="App">
                <Header></Header>
                {item}
                <StudentForm action={this.ubah}></StudentForm>
                <FooterComponent></FooterComponent>
            </div>
        );
    }

    ubah = (name, age) => {
        let newPeople = {};
        newPeople.name=name;
        newPeople.age=age;
        this.state.peoples.push(newPeople)
        this.setState(this.state);
    }
}

export default App;
