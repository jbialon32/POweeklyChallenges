import React from 'react';

import ItemList from './ItemList';
import ItemInfo from './ItemInfo';

class Main extends React.Component {

    state = {
                items: [
                            {
                                name: 'item1', 
                                desc: 'It\'s item 1'
                            }, 
                            {
                                name: 'item2', 
                                desc: 'It\'s item 2'
                            },
                            {
                                name: 'item3',
                                desc: 'I bet you thought this would only say "It\'s item 3"'
                            }
                        ],
                selectedItem: undefined
            }

    handlePickItem = (optionToPick) => {
        const filterVal = this.state.items.filter(item => {
            return item.name === optionToPick;
        })

        this.setState(() => ({
            selectedItem: filterVal[0]
        })
        );
    }

    render() {

        let itemInfo;

        if (this.state.selectedItem) {
            itemInfo = <ItemInfo item={this.state.selectedItem.desc} />
        } else {
            itemInfo = <ItemInfo item={this.state.selectedItem} />
        }

        return (
            <div>
                <div className="container">
                    <div className="itemListContainer">
                        <ItemList 
                            items={this.state.items}
                            handlePickItem={this.handlePickItem}
                        />
                    </div>
                    <div className="itemInfoContainer">
                        {itemInfo}
                    </div>
                </div>
            </div>
        )
    }

}

export default Main;