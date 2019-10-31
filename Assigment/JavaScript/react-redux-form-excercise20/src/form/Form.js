import React, {Component} from 'react';
import {connect} from "react-redux";
import {inAge, inName} from "./FormAction";

class Form extends Component{
    render() {
        return (
            <div>
                <form>
                    <label>name : </label>
                    <input type="text" onChange={this.handleNameInput}/>
                    <label>age : </label>
                    <input type="text" onChange={this.handleAgeInput}/>
                </form>
            </div>
        );
    }
    handleNameInput=(event)=> {
        this.props.dispatch({...inName, index:this.props.index, name:event.target.value})
        console.log(this.props.artist.name)
    }
    handleAgeInput=(event)=> {
        this.props.dispatch({...inAge, index:this.props.index, age:event.target.value})
        console.log(this.props.artist.age)
    }
}
const mapStateToProps=(state)=>{
    return {...state}
}

export default connect(mapStateToProps)(Form);
