package model.service;
import model.entity.sipaEnti;
import model.repository.SipaRepo;


public class SipaServe {
    private  static SipaServe SipaServe =new SipaServe();
    private  SipaServe(){}
    public static SipaServe getInstance(){return SipaServe ;}

    public void save(sipaEnti sipaEnti) throws Exception{
        try(SipaRepo personRepo = new SipaRepo()){
            personRepo.insert(sipaEnti);
            personRepo.commit();
        }
    }
    public void edit (sipaEnti sipaEnti) throws Exception{
        try(SipaRepo personRepo = new SipaRepo()){
            personRepo.update(sipaEnti);
            personRepo.commit();
            personRepo.close();
        }
    }


}
