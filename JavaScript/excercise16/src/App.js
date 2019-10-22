import React from 'react';
import './style/App.css';
import Card from "./components/Card";
import Header from "./components/Header";
import FooterComponent from "./components/FooterComponent";
import StudentForm from "./student/StudentForm";

class App extends React.Component {
    constructor(props) {
        super(props);
        this.state = {
            people: {name: "ilham", age: 10}
        }
        // this.handleChange=this.handleChange.bind(this)
    }

    render() {
        return (
            <div className="App">
                <Header></Header>
                <Card people={this.state.tulisan}>
                </Card>
                <button onClick={this.ubah}>Pencet</button>
                <StudentForm></StudentForm>
                <FooterComponent></FooterComponent>
            </div>
        );
    }
    ubah = () => {
        //this.state.people.name = "Malhi";
        //this.setState({people:{name:"Asu", age:"23"}});\
        let newPeople = {...this.state.people}
        newPeople.name="Ganteng";
        newPeople.age=12;
        this.setState({people:{...newPeople}})
    }
}
export default App;
