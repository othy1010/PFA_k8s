/**
 */
package k8s;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Volume Mount</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link k8s.VolumeMount#getName <em>Name</em>}</li>
 *   <li>{@link k8s.VolumeMount#getMountPath <em>Mount Path</em>}</li>
 *   <li>{@link k8s.VolumeMount#getReadOnly <em>Read Only</em>}</li>
 * </ul>
 *
 * @see k8s.K8sPackage#getVolumeMount()
 * @model
 * @generated
 */
public interface VolumeMount extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see k8s.K8sPackage#getVolumeMount_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link k8s.VolumeMount#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Mount Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mount Path</em>' attribute.
	 * @see #setMountPath(String)
	 * @see k8s.K8sPackage#getVolumeMount_MountPath()
	 * @model
	 * @generated
	 */
	String getMountPath();

	/**
	 * Sets the value of the '{@link k8s.VolumeMount#getMountPath <em>Mount Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mount Path</em>' attribute.
	 * @see #getMountPath()
	 * @generated
	 */
	void setMountPath(String value);

	/**
	 * Returns the value of the '<em><b>Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Read Only</em>' attribute.
	 * @see #setReadOnly(String)
	 * @see k8s.K8sPackage#getVolumeMount_ReadOnly()
	 * @model
	 * @generated
	 */
	String getReadOnly();

	/**
	 * Sets the value of the '{@link k8s.VolumeMount#getReadOnly <em>Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Read Only</em>' attribute.
	 * @see #getReadOnly()
	 * @generated
	 */
	void setReadOnly(String value);

} // VolumeMount
