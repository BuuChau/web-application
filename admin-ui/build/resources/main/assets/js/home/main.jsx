/**
 * Created by cuongnv on 6/8/17.
 */

var Finger = React.createClass({

    getInitialState: function () {
        return {
            fullName :'',
            age :'',
            picture:'',
            codeFinger:'',
            phoneNumber:''
        };
    },
    load: function (sender) {
        $.get('/ajax/check/finger', function (result) {
            sender.setState({
                fullName :result.fullName,
                age :result.age,
                picture:result.picture,
                codeFinger:result.codeFinger,
                phoneNumber:result.phoneNumber
            });
        });
    },
    componentDidMount: function () {
        this.load(this);
    },
    componentWillReceiveProps: function () {
        this.load(this);
    },
    render: function(){
        return (
            <div className="box-body height-box-finger">
                <div className="col-sm-6 col-xs-12">
                    <p className="text-center"><strong>HÌNH ẢNH THÀNH VIÊN</strong></p>
                    <div className="show-information-employee">
                        <img alt="Hình đại diện của thành viên." src={this.state.picture} style={{width: '100%'}} />
                    </div>
                </div>
                <hr className="visible-xs-block"/>
                <div className="col-sm-6 col-xs-12">
                    <p className="text-center"><strong>THÔNG TIN THÀNH VIÊN</strong></p>
                    <div className="show-information-employee">
                        <div>
                            <span> <b> Họ Và Tên : </b> {this.state.fullName}</span>
                        </div>
                        <hr className="visible-xs-block"/>
                        <div>
                            <span> <b> Tuổi : </b> {this.state.age}</span>
                        </div>
                        <hr className="visible-xs-block"/>
                        <div>
                            <span> <b> Mả Code : </b> {this.state.codeFinger} </span>
                        </div>
                        <hr className="visible-xs-block"/>
                        <div>
                            <span> <b> Số điện thoại : </b> {this.state.phoneNumber} </span>
                        </div>
                    </div>
                </div>
            </div>
        );
    }
});

$(document).ready(function () {
    ReactDOM.render(<Finger />,  document.getElementById("data"));
});