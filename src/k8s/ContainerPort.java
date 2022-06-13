/**
 */
package k8s;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link k8s.ContainerPort#getName <em>Name</em>}</li>
 *   <li>{@link k8s.ContainerPort#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link k8s.ContainerPort#getHostPort <em>Host Port</em>}</li>
 *   <li>{@link k8s.ContainerPort#getContainerPort <em>Container Port</em>}</li>
 * </ul>
 *
 * @see k8s.K8sPackage#getContainerPort()
 * @model
 * @generated
 */
public interface ContainerPort extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see k8s.K8sPackage#getContainerPort_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link k8s.ContainerPort#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Protocol</em>' attribute.
	 * @see #setProtocol(String)
	 * @see k8s.K8sPackage#getContainerPort_Protocol()
	 * @model required="true"
	 * @generated
	 */
	String getProtocol();

	/**
	 * Sets the value of the '{@link k8s.ContainerPort#getProtocol <em>Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protocol</em>' attribute.
	 * @see #getProtocol()
	 * @generated
	 */
	void setProtocol(String value);

	/**
	 * Returns the value of the '<em><b>Host Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Host Port</em>' attribute.
	 * @see #setHostPort(int)
	 * @see k8s.K8sPackage#getContainerPort_HostPort()
	 * @model required="true"
	 * @generated
	 */
	int getHostPort();

	/**
	 * Sets the value of the '{@link k8s.ContainerPort#getHostPort <em>Host Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host Port</em>' attribute.
	 * @see #getHostPort()
	 * @generated
	 */
	void setHostPort(int value);

	/**
	 * Returns the value of the '<em><b>Container Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container Port</em>' attribute.
	 * @see #setContainerPort(int)
	 * @see k8s.K8sPackage#getContainerPort_ContainerPort()
	 * @model required="true"
	 * @generated
	 */
	int getContainerPort();

	/**
	 * Sets the value of the '{@link k8s.ContainerPort#getContainerPort <em>Container Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container Port</em>' attribute.
	 * @see #getContainerPort()
	 * @generated
	 */
	void setContainerPort(int value);

} // ContainerPort
