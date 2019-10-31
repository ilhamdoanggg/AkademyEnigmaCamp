import React, {Component} from 'react';
import {connect} from "react-redux";

class TableForm extends Component {
    render() {
        return (
            <div>

                {this.props.artist.map((result) => {
                    return <table className="container">
                        <tr>
                            <th>Name</th>
                            <th>Age</th>
                        </tr>
                        <tr>
                            <td>{result.name}</td>
                            <td>{result.age}</td>
                        </tr>
                    </table>
                })}

            </div>
        );
    }
}

const handelTabelView = (state) => {
    return {...state}
}

export default connect(handelTabelView)(TableForm);
