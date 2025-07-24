import React, { Component } from 'react';

class Cart extends Component {
  render() {
    const { itemname, price } = this.props;
    return (
      <tr>
        <td>{itemname}</td>
        <td>{price}</td>
      </tr>
    );
  }
}

Cart.defaultProps = {
  itemname: "Unknown",
  price: 0
};

export default Cart;
