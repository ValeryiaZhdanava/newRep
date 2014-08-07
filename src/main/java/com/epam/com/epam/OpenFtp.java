package com.epam.com.epam;

import java.io.*;
import java.net.SocketException;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPFile;
public class OpenFtp {
     public static void main(String[] args) throws SocketException, IOException {
       FTPClient ftp = new FTPClient();
       ftp.connect("ftp.mozilla.org");
       ftp.enterLocalPassiveMode();
       ftp.login("anonymous", "");
       FTPFile[] listFTP;
       listFTP = ftp.listFiles();       
       for (FTPFile file : listFTP) {
         System.out.println(file.getName());
       }
       }
     }