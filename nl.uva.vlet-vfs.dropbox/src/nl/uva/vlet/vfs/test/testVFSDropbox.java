/*
 * Copyright 2006-2011 The Virtual Laboratory for e-Science (VL-e) 
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").  
 * You may not use this file except in compliance with the License. 
 * For details, see the LICENCE.txt file location in the root directory of this 
 * distribution or obtain the Apache Licence at the following location: 
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software 
 * distributed under the License is distributed on an "AS IS" BASIS, 
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
 * See the License for the specific language governing permissions and 
 * limitations under the License.
 * 
 * See: http://www.vl-e.nl/ 
 * See: LICENCE.txt (located in the root folder of this distribution). 
 * ---
 * $Id: testBlobStore.java,v 1.3 2012-02-27 14:33:22 skoulouz Exp $  
 * $Date: 2012-02-27 14:33:22 $
 */
// source: 
package nl.uva.vlet.vfs.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import junit.framework.Test;
import junit.framework.TestSuite;
import nl.uva.vlet.exception.VRLSyntaxException;
import nl.uva.vlet.exception.VlException;
import nl.uva.vlet.vfs.VFSClient;
import nl.uva.vlet.vfs.dropbox.DropboxFSFactory;
import nl.uva.vlet.vrl.VRL;
import nl.uva.vlet.vrs.ServerInfo;
import nl.uva.vlet.vrs.VRS;
import nl.uva.vlet.vrs.VRSContext;

/**
 *
 * @author S. Koulouzis
 */
public class testVFSDropbox extends testVFS {

    private static VRL testLoc;

    static {
        try {
//            testLoc = new VRL("swift://149.156.10.131:8443/auth/v1.0/testBlobStoreVFS");
//            testLoc = new VRL("swift://10.100.0.24:5000/v2.0/testBlobStoreVFS");
            testLoc = new VRL(
                    "swift://10.0.3.208:8080/auth/v1.0/testBlobStoreVFS");

//            testLoc = new VRL("sftp://skoulouz@elab.lab.uvalight.net/home/skoulouz/tmp/testBlobStoreVFS");
//            testLoc = new VRL(
//                    "filesystem:/testBlobStoreVFS");
        } catch (VRLSyntaxException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @Override
    public VRL getRemoteLocation() {
        return testLoc;
    }

    public static Test suite() throws VlException, FileNotFoundException,
            IOException {
        try {
            VRS.getRegistry().addVRSDriverClass(DropboxFSFactory.class);
        } catch (Exception e) {
            e.printStackTrace();
        }

        VRSContext context = VFSClient.getDefault().getVRSContext();

        ServerInfo info = ServerInfo.createFor(context, testLoc);

        return new TestSuite(testVFSDropbox.class);
    }

    public static void main(String args[]) {
        try {
            junit.textui.TestRunner.run(suite());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            VRS.exit();
            System.exit(0);
        }
    }
}
