package Upload;

import java.io.IOException;
import java.util.Scanner;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import org.primefaces.event.FileUploadEvent;
import org.primefaces.model.UploadedFile;

@ManagedBean(name = "uploadMB")
@ViewScoped
public class uploadBean{

    private UploadedFile uploadedFile;
    private String conteudo;

    public void upload(FileUploadEvent event) throws IOException {
        UploadedFile uploadedFile = event.getFile(); 
        
        conteudo = new Scanner(uploadedFile.getInputstream(),"UTF-8").useDelimiter("\\A").next();
        
    }
    

    public uploadBean() {
        
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }
    
    

    public UploadedFile getUploadedFile() {
        return uploadedFile;
    }

    public void setUploadedFile(UploadedFile uploadedFile) {
        this.uploadedFile = uploadedFile;
    }
    
    

}
