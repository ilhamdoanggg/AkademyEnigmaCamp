import React from "react";

class CardComponent extends React.Component {
    render() {
        return (
            <div className="card">
                <h1>{this.props.kirim.name}</h1>
                <p>{this.props.kirim.age}</p>
            </div>

        );
    }
}
export default CardComponent;
