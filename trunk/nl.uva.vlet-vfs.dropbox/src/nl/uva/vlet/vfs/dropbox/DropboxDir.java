package nl.uva.vlet.vfs.dropbox;

import nl.uva.vlet.exception.VlException;
import nl.uva.vlet.vfs.VDir;
import nl.uva.vlet.vfs.VFSNode;
import nl.uva.vlet.vfs.VFileSystem;
import nl.uva.vlet.vrl.VRL;

/**
 *
 *
 * @author S. Koulouzis
 */
public class DropboxDir extends VDir {
    
    
    public DropboxDir(VFileSystem dbfs, VRL vrl){
        super(dbfs, vrl);
    }

    @Override
    public VFSNode[] list() throws VlException {
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
    public boolean exists() throws VlException {
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
    public long getNrOfNodes() throws VlException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(boolean recurse) throws VlException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
