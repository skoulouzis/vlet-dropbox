package nl.uva.vlet.vfs.dropbox;

import nl.uva.vlet.exception.VlException;
import nl.uva.vlet.vfs.VFSFactory;
import nl.uva.vlet.vfs.VFileSystem;
import nl.uva.vlet.vrl.VRL;
import nl.uva.vlet.vrs.ServerInfo;
import nl.uva.vlet.vrs.VRSContext;

public class DropboxFSFactory extends VFSFactory {

    private DropboxFileSystem dropboxFS;

    @Override
    public VFileSystem createNewFileSystem(VRSContext context, ServerInfo info,
            VRL location) throws VlException {
        dropboxFS = new DropboxFileSystem(context, info);
        return dropboxFS;
    }

    @Override
    public String getName() {
        return "Dropbox";
    }

    @Override
    public String[] getSchemeNames() {
        return new String[]{"dropbox"};
    }

    @Override
    public void clear() {
        if (dropboxFS != null) {
            dropboxFS.dispose();
        }
    }

    @Override
    protected ServerInfo updateServerInfo(VRSContext context, ServerInfo info,
            VRL loc) throws VlException {
        // check update ServerInfo here
        // String userInf=loc.getUserinfo();
        // info.setUsername(userInf);
        // info.store()
        // Set Authentication information

        info.setUsePasswordAuth();
        info.store();

        return info;
    }
}
