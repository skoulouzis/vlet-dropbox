package nl.uva.vlet.vfs.dropbox;

import java.io.InputStream;
import java.io.OutputStream;
import nl.uva.vlet.exception.VlException;
import nl.uva.vlet.vfs.VFile;
import nl.uva.vlet.vfs.VFileSystem;
import nl.uva.vlet.vrl.VRL;

/**
 *
 *
 * @author S. Koulouzis
 */
public class DropboxFile extends VFile {

    public DropboxFile(VFileSystem vfs, VRL vrl) {
        super(vfs, vrl);
    }

    @Override
    public boolean exists() throws VlException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public long getLength() throws VlException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public VRL rename(String newNameOrPath, boolean nameIsPath) throws VlException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean create(boolean ignoreExisting) throws VlException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public long getModificationTime() throws VlException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isReadable() throws VlException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isWritable() throws VlException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete() throws VlException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public InputStream getInputStream() throws VlException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public OutputStream getOutputStream() throws VlException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void uploadFrom(VFile localFile) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
