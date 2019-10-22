import React, {Component} from "react";

class StudentForm extends Component {
    constructor(props) {
        super(props)
        this.state = {name: "", age: ""}
    }

    handleName = (event) => {
        console.log("ini name")
        this.setState({name: event.target.value});
    }
    handleAge = (event) => {
        console.log("ini age")
        this.setState({age: event.target.value});
    }
    handelSubmit = () => {
        let name = this.state.name;
        let age = this.state.age;
        this.props.action(name, age);
    }

    render() {
        return (
            <div className="card">
                <form className="wrapper">
                    <label>Name :</label>
                    <input type="text" onChange={this.handleName} value={this.state.name}/>
                    <label>age :</label>
                    <input type="text" onChange={this.handleAge} value={this.state.age}/>
                    <h1>{this.state.tulisan}</h1>
                </form>
                <button onClick={this.handelSubmit}>Pencet</button>
            </div>
        );
    }
}

export default StudentForm;
