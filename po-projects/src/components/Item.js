import React from 'react';

const Item = (props) => (
    <div className="item">
        <button 
            className="item__btn"
            onClick={(e) => {
                props.handlePickItem(props.itemText)
            }}
        >
            {props.itemText}
        </button>
    </div>
)

export default Item;