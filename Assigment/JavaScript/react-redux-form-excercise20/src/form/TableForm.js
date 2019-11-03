import React, {Component} from 'react';
import {connect} from "react-redux";

class TableForm extends Component {
    render() {
        return (
            <div>
                <table className="container">
                    <tr>
                        <th>No </th>
                        <th>Name </th>
                        <th>Age </th>
                    </tr>
                {this.props.artist.map((result, index) => {
                    return<tr>
                            <td>{index+1}</td>
                            <td>{result.name}</td>
                            <td>{result.age}</td>
                        </tr>
                })}
                </table>
            </div>
        );
    }
}

const handelTabelView = (state) => {
    return {...state}
}

export default connect(handelTabelView)(TableForm);
