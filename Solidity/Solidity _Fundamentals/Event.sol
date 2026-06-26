// SPDX-License-Identifier: MIT
pragma solidity ^0.8.20;

contract Events {
    mapping(address => uint256) public balances;

    event Deposit(address indexed owner, uint256 amount);

    function deposit() external payable {
        balances[msg.sender] += msg.value;
    //        emit Deposit(msg.Sender, msg.value);
    }
}