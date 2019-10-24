import React, {Component} from "react";

class ProductDetail extends Component {
    render() {
        // const param=this.state.
//        let items = this.props.items;
        let param=this.props.match.params.id;
        let detail = Object.create(this.props.items)
        let getProdusctId = {...detail.find(detail => detail.id === parseInt(param))}
        console.log(this.props.match.params.id)
        console.log(detail)
        console.log(getProdusctId)
        return (
            <div>
                    <h1>{getProdusctId.id}</h1>
             </div>
        );
    }
}

export default ProductDetail;
