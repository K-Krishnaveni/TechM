
import React from 'react';

const ProductItem = ({ title, price, image }) => {
  return (
    <div className="col-md-4">
      <div className="card mb-4 shadow-sm">
        <img src={image} className="card-img-top" alt={title} style={{ height: '200px', objectFit: 'contain' }} />
        <div className="card-body">
          <h5 className="card-title">{title}</h5>
          <p className="card-text"><strong>Price:</strong> ${price}</p>
        </div>
      </div>
    </div>
  );
};

export default ProductItem;
