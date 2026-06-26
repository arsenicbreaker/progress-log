// SPDX-License-Identifier: MIT   
pragma solidity ^0.8.20;  

contract HelloWorld {
    // default 256 kalo mau lebih efisiensi tambahkan limit ketika deklrasi
    int256 Integer;
    uint256 UnsignedInteger; //khusus positif dan bulat
    string String;
    address Address; //tipe data untuk menampung address
    bool Boolean;
    bytes32 Bytes;

    uint32 Minutes = 1 minutes;
    uint32 Day = 1 days;
    uint32 Week = 1 weeks;
}