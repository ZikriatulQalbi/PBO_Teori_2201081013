/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ZikriatulQalbi180423;

/**
 *
 * @author hp
 */
public class BukuAlamatData {
    private BukuAlamat data[] = new BukuAlamat[100];
    private int index;
    
    public void insert(BukuAlamat bukuAlamat){
        data[index] = bukuAlamat;
        index++;
    }
    public void update(int index, BukuAlamat bukuAlamat){
        data[index] = bukuAlamat;
    }
    public void delete(int index){
        data[index] = null;
    }
    public BukuAlamat[] getData(){
        return data;
    }
    
    public static void main(String[] args){
        BukuAlamatData data = new BukuAlamatData();
            BukuAlamat data1 = new BukuAlamat();
            data1.setNama("qalbi");
            data1.setAlamat("padang");
            data1.setNotelp("0852xxxxxxx");
            data1.setEmail("qalbi@gmail.co.id");
            data.insert(data1);
            
            BukuAlamat[] temp = data.getData();
            for(int i=0;i<temp.length;i++){
                if(temp[i]!=null){
                    System.out.println("Data ke -->"+(i+1));
                    System.out.println("Nama    : "+temp[i].getNama());
                    System.out.println("Alamat  : "+temp[i].getAlamat());
                    System.out.println("Notelp  : "+temp[i].getNotelp());
                    System.out.println("Email   : "+temp[i].getEmail());
                }
            }
        
    }
}


