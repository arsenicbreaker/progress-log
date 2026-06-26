// SPDX-License-Identifier: MIT
pragma solidity ^0.8.32;

//cuman nge return sesuatu tanpa ngubah 

contract Mutability {
    uint256 balance = 27;

    function getBalance() public view returns (uint256) {
        return balance;
    }

    function add(uint256 a, uint256 b) public pure returns(uint256) {
        return a + b;
    }

    //method yg bisa menerima funding
    function deposit() public payable {
        balance = balance + msg.value;
    }

    //Global variable
    //msg.sender() siapa yg deploy dialah yg sender
    //msg.value() jumlah funding yg sender kasih ketika ia dipanggil
}