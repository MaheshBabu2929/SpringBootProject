package com.example.Mahesh.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

   @Entity
    public class Laptop {
        @Id
        private  int laptopId;
        private String laptopBrand;
        private String laptopProcessor;
        private int laptopVersion;

        public void setLaptopId(int laptopId){
            this.laptopId=laptopId;
        }
        public int getLaptopId(){
            return laptopId;
        }

        public String getLaptopBrand() {
            return laptopBrand;
        }

        public void setLaptopBrand(String laptopBrand) {
            this.laptopBrand = laptopBrand;
        }

        public String getLaptopProcessor() {
            return laptopProcessor;
        }

        public void setLaptopProcessor(String laptopProcessor) {
            this.laptopProcessor = laptopProcessor;
        }
        public void setLaptopVersion(int laptopVersion){
            this.laptopVersion=laptopVersion;
        }
        public int getLaptopVersion(){
            return laptopVersion;
        }

    }
