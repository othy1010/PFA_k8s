/**
 */
package k8s;

import java.util.Map;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Metadata</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link k8s.Metadata#getName <em>Name</em>}</li>
 *   <li>{@link k8s.Metadata#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link k8s.Metadata#getLabels <em>Labels</em>}</li>
 *   <li>{@link k8s.Metadata#getAnnotations <em>Annotations</em>}</li>
 * </ul>
 *
 * @see k8s.K8sPackage#getMetadata()
 * @model
 * @generated
 */
public interface Metadata extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see k8s.K8sPackage#getMetadata_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link k8s.Metadata#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Namespace</em>' attribute.
	 * @see #setNamespace(String)
	 * @see k8s.K8sPackage#getMetadata_Namespace()
	 * @model
	 * @generated
	 */
	String getNamespace();

	/**
	 * Sets the value of the '{@link k8s.Metadata#getNamespace <em>Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Namespace</em>' attribute.
	 * @see #getNamespace()
	 * @generated
	 */
	void setNamespace(String value);

	/**
	 * Returns the value of the '<em><b>Labels</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Labels</em>' attribute.
	 * @see #setLabels(Map)
	 * @see k8s.K8sPackage#getMetadata_Labels()
	 * @model transient="true"
	 * @generated
	 */
	Map<String, String> getLabels();

	/**
	 * Sets the value of the '{@link k8s.Metadata#getLabels <em>Labels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Labels</em>' attribute.
	 * @see #getLabels()
	 * @generated
	 */
	void setLabels(Map<String, String> value);

	/**
	 * Returns the value of the '<em><b>Annotations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotations</em>' attribute.
	 * @see #setAnnotations(Map)
	 * @see k8s.K8sPackage#getMetadata_Annotations()
	 * @model transient="true"
	 * @generated
	 */
	Map<String, String> getAnnotations();

	/**
	 * Sets the value of the '{@link k8s.Metadata#getAnnotations <em>Annotations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotations</em>' attribute.
	 * @see #getAnnotations()
	 * @generated
	 */
	void setAnnotations(Map<String, String> value);

} // Metadata
