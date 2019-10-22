import React from "react";

class Card extends React.Component {

    render() {
        return (
            <div className="card">
                <h1>{this.props.item.name}</h1>
                <h1>{this.props.item.age}</h1>
            </div>
        );
    }
}

export default Card;
