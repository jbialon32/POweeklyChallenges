import React from 'react';

const ItemInfo = (props) => (
    <div className="item-info">
        <div className="item-info-header">
            <h3 className="item-info__title">Item Info</h3>
        </div>
        
        {props.item === undefined && <p>Select an item to see the description.</p>}
        {props.item !== undefined && <p>Description: {props.item}</p>}

    </div>
)

export default ItemInfo;