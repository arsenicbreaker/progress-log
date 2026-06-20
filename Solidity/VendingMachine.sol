// SPDX-License-Identifier: MIT
pragma solidity ^0.8.20;

contract VendingMachine {

    // mendeklarasikan variabel state dari kontrak
    address public owner;
    mapping (address => uint) public cupcakeBalances;
    uint public stock;

    //  contract di deploy, constructor akan dijalankan sekali dan hanya sekali untuk menetapkan alamat sebagai pemilik kontrak dan saldo stock menjadi 100
    constructor() {
        owner = msg.sender;
        stock = 100;
    }

    // fungsi untuk menambah stock
    function addStock(uint amount) public {
        require(msg.sender == owner, "Only the owner can refill.");
        stock += amount;
    }

    // fungsi untuk melihat stock
    function getStock() public view returns (uint) {
        return stock;
    }


    // fungsi untuk menghitung sisa stock 
    function calculateStock(uint amount) public view returns (uint) {
        return stock - amount;
    }


    // fungsi siapa saja untuk membeli cupcake
    function purchase(uint amount) public payable {
        require(msg.value >= amount * 1 ether, "You must pay at least 1 ETH per cupcake");
        require(stock >= amount, "Not enough cupcakes in stock to complete this purchase");
        stock -= amount;
        cupcakeBalances[msg.sender] += amount;
    }
}
