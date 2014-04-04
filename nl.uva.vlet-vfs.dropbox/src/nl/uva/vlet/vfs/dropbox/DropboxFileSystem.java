package nl.uva.vlet.vfs.dropbox;

import nl.uva.vlet.exception.*;
import nl.uva.vlet.vfs.*;
import nl.uva.vlet.vrl.VRL;
import nl.uva.vlet.vrs.ServerInfo;
import nl.uva.vlet.vrs.VRSContext;

/**
 *
 *
 *
 * @author S. Koulouzis.
 *
 */
public class DropboxFileSystem extends FileSystemNode {

    public DropboxFileSystem(VRSContext context, ServerInfo info)
            throws VlInitializationException, VlPasswordException, VRLSyntaxException, VlIOException, VlException {
        super(context, info);
    }

    @Override
    public VFile newFile(VRL fileVrl) throws VlException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public VDir newDir(VRL dirVrl) throws VlException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public VFSNode openLocation(VRL vrl) throws VlException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isConnected() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void connect() throws VlException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void disconnect() throws VlException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
