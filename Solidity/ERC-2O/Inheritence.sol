// SPDX-License-Identifier: MIT
pragma solidity ^0.8.20;

import {Ownable} from "";

contract Ownable {
    error Ownable_NotOwner();
    address public owner;

    constructor() {
        owner = msg.sender;
    }

    modifier onlyOwner() {
        if(msg.sender != owner) {
            revert Ownable_NotOwner();
        }
        _;
    }
}

contract MyToken is Ownable {
    function mint() public onlyOwner {

    }
}