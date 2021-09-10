import React from 'react';

import Item from './Item';

const ItemList = (props) => (
    <div>
        <div className="item-list-header">
            <h3 className="item-list-header__title">Items</h3>
        </div>
        {
            props.items.map((item, index) => (
                    <Item
                        key={item.name}
                        itemText={item.name}
                        handlePickItem={props.handlePickItem}
                    />
                )
            )
        }
    </div>
)

export default ItemList;