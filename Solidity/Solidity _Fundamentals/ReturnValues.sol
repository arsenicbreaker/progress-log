/// SPDX-License-Identifier: MIT
pragma solidity ^0.8.20;

contract ReturnValues {
address public owner;

constructor() {
    owner = msg.sender;
}


// modifier onlyOwner() {
//     if(msg.sender != owner) {
//     revert();
//     }
// } 

// function withdraw() external payable {
//     if(msg.sender != owner) {

//     }
// }

function getInfo() public pure returns (string memory, uint256) {
    return ("Budi",25);
}

function get() public pure returns (string memory nama, uint256 umur) {
    nama = "Budi";
    umur = 20;
}
}