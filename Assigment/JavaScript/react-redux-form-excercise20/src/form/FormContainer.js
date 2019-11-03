import React, {Component} from 'react';
import {connect} from "react-redux";
import {add, remove} from "./FormAction";
import TableForm from "./TableForm";
import './style.css';
import Form from "./Form";

class FormContainer extends Component{
    constructor(props) {
        super(props,);
    }
    render() {
        //console.log(this.props.dispatch(add))
        return (
            <div>
                <button className="btn-download" onClick={()=>this.props.dispatch(add)}>Tambah Form</button>
                {this.props.artist.map((element, index)=>{
                    return <Form element={element} index={index}/>
                })}
                <TableForm/>
                {/*<button className="btn-download" onClick={()=>this.props.dispatch(remove)}>Hapus Form</button>*/}
                {/*{this.props.form.map((table, index)=>{
                    return <div>
                        <TableForm/>
                    </div>
                })}
                <button onClick={this.props.remove}>Hapus</button>*/}
            </div>
        );
    }
}
const handleMapInputan=(state)=>{
    return {...state}
}

export default connect(handleMapInputan)(FormContainer);
