/**
 * Created by cuongnv on 6/8/17.
 */

var Form = React.createClass({
    render: function(){
        return (
            <div>
                <input type="submit" onClick={this.props.onUserClick} />
                <h3>You have pressed the button {this.props.counter} times!</h3>
            </div>
        );
    }
});

$(document).ready(function () {
    ReactDOM.render(<Form />,  document.getElementById("data"));
});