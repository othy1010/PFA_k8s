/**
 */
package k8s;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>HTTP Get Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link k8s.HTTPGetAction#getPath <em>Path</em>}</li>
 *   <li>{@link k8s.HTTPGetAction#getPort <em>Port</em>}</li>
 *   <li>{@link k8s.HTTPGetAction#getScheme <em>Scheme</em>}</li>
 *   <li>{@link k8s.HTTPGetAction#getHttpHeaders <em>Http Headers</em>}</li>
 * </ul>
 *
 * @see k8s.K8sPackage#getHTTPGetAction()
 * @model
 * @generated
 */
public interface HTTPGetAction extends EObject {
	/**
	 * Returns the value of the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' attribute.
	 * @see #setPath(String)
	 * @see k8s.K8sPackage#getHTTPGetAction_Path()
	 * @model
	 * @generated
	 */
	String getPath();

	/**
	 * Sets the value of the '{@link k8s.HTTPGetAction#getPath <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' attribute.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(String value);

	/**
	 * Returns the value of the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' attribute.
	 * @see #setPort(int)
	 * @see k8s.K8sPackage#getHTTPGetAction_Port()
	 * @model
	 * @generated
	 */
	int getPort();

	/**
	 * Sets the value of the '{@link k8s.HTTPGetAction#getPort <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port</em>' attribute.
	 * @see #getPort()
	 * @generated
	 */
	void setPort(int value);

	/**
	 * Returns the value of the '<em><b>Scheme</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scheme</em>' attribute.
	 * @see #setScheme(String)
	 * @see k8s.K8sPackage#getHTTPGetAction_Scheme()
	 * @model
	 * @generated
	 */
	String getScheme();

	/**
	 * Sets the value of the '{@link k8s.HTTPGetAction#getScheme <em>Scheme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scheme</em>' attribute.
	 * @see #getScheme()
	 * @generated
	 */
	void setScheme(String value);

	/**
	 * Returns the value of the '<em><b>Http Headers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Http Headers</em>' attribute.
	 * @see #setHttpHeaders(EList)
	 * @see k8s.K8sPackage#getHTTPGetAction_HttpHeaders()
	 * @model many="false" transient="true"
	 * @generated
	 */
	EList<HTTPHeader> getHttpHeaders();

	/**
	 * Sets the value of the '{@link k8s.HTTPGetAction#getHttpHeaders <em>Http Headers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Http Headers</em>' attribute.
	 * @see #getHttpHeaders()
	 * @generated
	 */
	void setHttpHeaders(EList<HTTPHeader> value);

} // HTTPGetAction
