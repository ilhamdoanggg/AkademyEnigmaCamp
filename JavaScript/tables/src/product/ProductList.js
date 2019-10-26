import React, {Component} from 'react';
import {Link} from "react-router-dom";
import ProductDetail from "./ProductDetail";

class ProductList extends Component {
    render() {
        let items = this.props.items;
        return(
            <div id="Table">
                <table>
                    <tr><th>Id</th><th>Product Name</th><th>Quantity</th><th>Price</th><th>Detail</th></tr>
                    {items.map(item => {
                        return (
                            <tr>
                                <td>{item.id}</td>
                                <td>{item.productName}</td>
                                <td>{item.quantity}</td>
                                <td>{item.price}</td>
                                <td>
                                    <Link to={"/product-detail/"+item.id}>
                                    detail</Link>
                                </td>
                            </tr>
                        );
                    })}
                </table>
            </div>
        )
    }
}
export default ProductList;
