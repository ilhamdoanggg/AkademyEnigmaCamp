import React from "react";

class StudentForm extends React.Component {
    constructor(props){
        super(props)
        this.state={
            tulisan:"Ganteng"
        }
    }
    handleChange=(event)=>{
        this.setState({tulisan: event.target.value})
    }
    render() {
        return (
            <div className="card">
                <form className="wrapper">
                    <label>Name :</label>
                    <input type="text"
                           onChange={this.handleChange}
                           value={this.state.tulisan} />
                    <h1>{this.state.tulisan}</h1>
                </form>
            </div>
        );
    }
}

export default StudentForm;
